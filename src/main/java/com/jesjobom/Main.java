package com.jesjobom;

import com.microsoft.applicationinsights.TelemetryClient;
import com.microsoft.applicationinsights.TelemetryConfiguration;
import com.microsoft.applicationinsights.core.dependencies.google.common.base.StandardSystemProperty;

import java.util.UUID;

public class Main {

    private TelemetryClient telemetryClient;

    public Main() {
        TelemetryConfiguration telemetryConfiguration = TelemetryConfiguration.getActive();

        telemetryConfiguration.getChannel().setDeveloperMode(true);
        telemetryConfiguration.setInstrumentationKey("<KEY>");
        telemetryConfiguration.setTrackingIsDisabled(false);

        telemetryClient = new TelemetryClient(telemetryConfiguration);

        telemetryClient.getContext().getCloud().setRole("ROLE");
        telemetryClient.getContext().getCloud().setRoleInstance("INSTANCE");
        telemetryClient.getContext().getProperties().put("Java version", StandardSystemProperty.JAVA_VERSION.value());
        telemetryClient.getContext().getUser().setId("1");
        telemetryClient.getContext().getSession().setId(UUID.randomUUID().toString());
        telemetryClient.getContext().getDevice().setOperatingSystem(StandardSystemProperty.OS_NAME.value());
        telemetryClient.getContext().getDevice().setOperatingSystemVersion(StandardSystemProperty.OS_VERSION.value());
    }
}
