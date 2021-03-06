package com.angelis.tera.game.presentation.network.packet.client.character;

import java.nio.ByteBuffer;

import com.angelis.tera.game.presentation.network.connection.TeraGameConnection;
import com.angelis.tera.game.presentation.network.packet.TeraClientPacket;
import com.angelis.tera.game.process.services.PlayerService;

public class CM_CHARACTER_RESTORE extends TeraClientPacket {

    private int playerId;
    
    public CM_CHARACTER_RESTORE(final ByteBuffer byteBuffer, final TeraGameConnection connection) {
        super(byteBuffer, connection);
    }

    @Override
    protected void readImpl() {
        this.playerId = readD();
    }

    @Override
    protected void runImpl() {
        PlayerService.getInstance().restorePlayer(this.getConnection().getAccount().getPlayerById(playerId));
    }

}
