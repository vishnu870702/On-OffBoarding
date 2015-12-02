package se.softhouse.bthwebintro.configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

/**
 * Configuration class for dropwizard. Extend this class with additional
 * configuration parameters.
 */
public class BTHWebIntroConfiguration extends Configuration implements AssetsBundleConfiguration
{
    @Valid
    @NotNull
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();

    @Override
    public AssetsConfiguration getAssetsConfiguration() 
    {
      return assets;
    }
}
