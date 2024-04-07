package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import cn.gbshop.flutter_upgrade.FlutterUpgradePlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterUpgradePlugin.registerWith(registry.registrarFor("cn.gbshop.flutter_upgrade.FlutterUpgradePlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
