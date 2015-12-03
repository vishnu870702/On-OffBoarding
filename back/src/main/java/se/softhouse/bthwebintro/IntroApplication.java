package se.softhouse.bthwebintro;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import se.softhouse.bthwebintro.configuration.BTHWebIntroConfiguration;
import se.softhouse.bthwebintro.solution.LoginResource;

/**
 * Main application class for Web Introduction presentation. Will start dropwizard application server.
 * @see <a href="http://www.dropwizard.io/getting-started.html">http://www.dropwizard.io/getting-started.html</a>
 *
 */
public class IntroApplication extends Application<BTHWebIntroConfiguration>
{

    @Override
    public void run(BTHWebIntroConfiguration configuration, Environment environment)
    {
    	environment.jersey().register(new LoginResource());
    }
    
    @Override
    public void initialize(Bootstrap<BTHWebIntroConfiguration> bootstrap)
    {
        bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }
    

    public static void main(String[] args) throws Exception
    {
        new IntroApplication().run(args);
    }
}