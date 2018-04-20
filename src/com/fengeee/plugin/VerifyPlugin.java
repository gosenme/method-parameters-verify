package com.fengeee.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * @author : wanggaoxiang@cvte.com
 * Date: 2018-03-21
 * @since 1.0
 */
public class VerifyPlugin extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getProject();
        String s = Messages.showInputDialog(project, "What's your name?", "Hello", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello " + s + "!", "Welcome", Messages.getInformationIcon());
    }
}
