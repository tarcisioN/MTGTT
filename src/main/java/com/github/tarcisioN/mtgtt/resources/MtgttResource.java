package com.github.tarcisioN.mtgtt.resources;

import com.codahale.metrics.annotation.Timed;
import com.github.tarcisioN.mtgtt.core.Saying;
import com.github.tarcisioN.mtgtt.views.TournamentView;
import com.google.common.base.Optional;
import io.dropwizard.views.View;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by root on 10/25/16.
 */
@Path("/tournament")
@Produces(MediaType.TEXT_HTML)
public class MtgttResource
{
    private final String defaultName = "player";

    @GET
    @Timed
    public View rankTournament(@QueryParam("player1") Optional<String> player1, @QueryParam("player2") Optional<String> player2)
    {
        final String player1Value = player1.or(defaultName);
        final String player2Value = player2.or(defaultName);

        return new TournamentView(player1Value, player2Value);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Timed
    public String rankTournament(Saying saying)
    {
        return saying.getContent();
    }
}
