package org.leanpoker.player.gamestate;

import com.google.gson.annotations.SerializedName;

public enum PlayerStatus {

    @SerializedName("active") ACTIVE,
    @SerializedName("folded") FOLDED,
    @SerializedName("out") OUT;
    
}
