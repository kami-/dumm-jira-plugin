dumm-jira-plugin
================

An introductory JIRA plugin, that let you comment an issue with someone else's name.


## Environment

### Atlassian SDK

JIRA plugin development requires Atlassian SDK 5.0.4 . Follow the [Atlassian SDK Set up](https://developer.atlassian.com/display/DOCS/Set+up+the+Atlassian+Plugin+SDK+and+Build+a+Project) to install it.


## Build

Use the `atlas-` commands, such as `atlas-compile`, `atlas-package`. These are the respective Maven commands and can be followed by Maven arguments.

## Run

Local JIRA instance can be ran with the `atlas-debug`, `atlas-run` commands. With `atlas-debug` you can remote debug on the `5005` port.

### Reinstall plugin

Plugin can be reinstalled without restarting JIRA by running `atlas-cli` command and then running the `pi` command.
