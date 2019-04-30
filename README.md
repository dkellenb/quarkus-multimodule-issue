# Quarkus Multi Module

This project consists of:

- config-not-related => an Eclipse Micro Profile Config Source which always throws an IllegalStateException
- Quarkus with no dependency to config-not-related

After `mvn compile && cd quarkus && mvn quarkus:dev` the IllegalStateException is thrown.
