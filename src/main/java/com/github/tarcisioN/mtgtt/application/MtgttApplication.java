package com.github.tarcisioN.mtgtt.application;

import com.github.tarcisioN.mtgtt.MtgttConfiguration;
import com.github.tarcisioN.mtgtt.resources.MtgttResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

/**
 * Created by root on 10/25/16.
 */
public class MtgttApplication extends Application<MtgttConfiguration>
{
    @Override
    public void initialize(Bootstrap<MtgttConfiguration> bootstrap)
    {
        bootstrap.addBundle(new ViewBundle());
    }

    public static void main(String[] args) throws Exception
    {
        new MtgttApplication().run("server");
    }

    @Override
    public void run(MtgttConfiguration mtgttConfiguration, Environment environment) throws Exception
    {
        environment.jersey().register(new MtgttResource());
    }

    @Override
    public String getName()
    {
        return "mtg-tournament-tool";
    }
}
