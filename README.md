# [TOML](https://github.com/toml-lang/toml) language support for IntelliJ IDEA based IDEs

The plugin provides nothing but syntax highlighting at the moment.

## Installation

We ship pre-release builds in the nightly channel _only_.

To use them you need to follow the [instructions](https://www.jetbrains.com/idea/help/managing-enterprise-plugin-repositories.html) of adding
additional plugin repository and paste the URL:

    - TOML: https://plugins.jetbrains.com/plugins/nightly/8195

As this is a preview release, something might go wrong. So, be brave to face some nasty bugs.

## Building

```
$ git clone https://github.com/intellij-rust/intellij-toml --recursive
$ cd intellij-toml
$ ./gradlew buildPlugin
```

This creates a zip archive in `build/distributions` which you can install with the `Install plugin from disk...` action found in `Settings > Plugins`.

Note that it will download all build dependencies, so make sure you have enough space (one GB should be enough).
You need IDEA 15 (or newer) to use this plugin.

Current high-volatility state entails no support just yet, so be patient, please, and save your anger until it hits stability milestone (at least)
 Until then, no crusade to fight any issues (even completely relevant ones) may be possible.

## Contributing

See [Contributing](https://github.com/intellij-rust/intellij-rust/blob/master/CONTRIBUTING.md) in the IntellJ-Rust plugin.
