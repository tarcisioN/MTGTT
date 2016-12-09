package com.github.tarcisioN.mtgtt.views;

import io.dropwizard.views.View;

/**
 * Created by tarcisioN on 10/25/16.
 */
public class TournamentView extends View
{
    private String player1;
    private String player2;

    public TournamentView(String player1, String player2)
    {
        super("tournament.mustache");

        this.player1 = player1;
        this.player2 = player2;
    }

    public String getPlayer1()
    {
        return player1;
    }

    public void setPlayer1(String player1)
    {
        this.player1 = player1;
    }

    public String getPlayer2()
    {
        return player2;
    }

    public void setPlayer2(String player2)
    {
        this.player2 = player2;
    }
}
