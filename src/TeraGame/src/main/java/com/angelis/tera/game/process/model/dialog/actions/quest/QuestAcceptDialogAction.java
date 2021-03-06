package com.angelis.tera.game.process.model.dialog.actions.quest;

import com.angelis.tera.game.process.model.dialog.AbstractDialogAction;
import com.angelis.tera.game.process.model.dialog.Dialog;
import com.angelis.tera.game.process.model.player.Player;
import com.angelis.tera.game.process.model.quest.Quest;
import com.angelis.tera.game.process.services.QuestService;

public class QuestAcceptDialogAction extends AbstractDialogAction {

    private final Quest quest;

    public QuestAcceptDialogAction(final Player player, final Dialog dialog, final Quest quest) {
        super(player, dialog);
        this.quest = quest;
    }

    @Override
    public void action() {
        QuestService.getInstance().onPlayerStartQuest(this.player, this.dialog.getNpc(), this.quest);
    }
}
