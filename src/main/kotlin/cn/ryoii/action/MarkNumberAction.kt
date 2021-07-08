package cn.ryoii.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction

class MarkNumberAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val editor = event.getRequiredData(CommonDataKeys.EDITOR)
        val project = event.getRequiredData(CommonDataKeys.PROJECT)
        val document = editor.document

        var idx = 1

        WriteCommandAction.runWriteCommandAction(project) {
            editor.caretModel.runForEachCaret {
                val t = "${idx++}"
                document.insertString(it.selectionStart, t)
                if (it.selectionStart == it.selectionEnd) {
                    it.moveToOffset(it.selectionStart + t.length)
                }
            }
        }
    }
}
