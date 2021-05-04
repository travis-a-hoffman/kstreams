package io.firkin.containers;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.TestcontainersConfiguration;

import java.io.IOException;
import java.util.HashMap;

import static io.firkin.containers.ContainerUtils.CONFLUENT_VERSION;
import static io.firkin.containers.ContainerUtils.CP_ZOOKEEPER;
import static java.lang.String.format;

public class ZookeeperContainer extends GenericContainer<ZookeeperContainer> {

  private static final int ZOOKEEPER_INTERNAL_PORT = 2181;
  private static final int ZOOKEEPER_TICK_TIME = 2000;

  private final String networkAlias = "zookeeper";

  public ZookeeperContainer() throws IOException {
    this(CONFLUENT_VERSION);
  }

  public ZookeeperContainer(String confluentPlatformVersion) throws IOException {
    super(getZookeeperContainerImage(confluentPlatformVersion));

    var env = new HashMap<String, String>();
    env.put("ZOOKEEPER_CLIENT_PORT", Integer.toString(ZOOKEEPER_INTERNAL_PORT));
    env.put("ZOOKEEPER_TICK_TIME", Integer.toString(ZOOKEEPER_TICK_TIME));
    withEnv(env);

    addExposedPort(ZOOKEEPER_INTERNAL_PORT);
    withNetworkAliases(networkAlias);
  }

  public String getInternalUrl() {
    return format("%s:%d", networkAlias, ZOOKEEPER_INTERNAL_PORT);
  }

  private static String getZookeeperContainerImage(String confluentPlatformVersion) {
    return (String) TestcontainersConfiguration
        .getInstance().getProperties().getOrDefault(
            "zookeeper.container.image",
            CP_ZOOKEEPER + ":" + confluentPlatformVersion
        );
  }
}