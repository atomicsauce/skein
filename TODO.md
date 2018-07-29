# Things that could use fixing.

*   Bikeshed reports out on docstring coverage, but doesn't consider
    missing docstrings an error; this should either error on any
    missing docstrings (if we want to be twitchy) or else we should
    parse the output and pick a target percentage below which is an
    error.

*   The "defstate" macro from the "mount" package, which is used in
    a number of places in the standard Luminus startup code, causes
    the Eastwood "redefd-vars" linter to error; in the prebuild
    tests we are currently suppressing that linter, but at some
    point either the "mount" maintainer should be asked to fix their
    macro, or else the Eastwood maintainer should be asked to adjust
    their linter.

*   We're setting "test-paths" in "project.clj", using a Gradle-style
    project directory structure rather than the more traditional
    Leinengen one. There's no equivalent "test-resource-paths"
    setting, but we've got an empty "src/test/resources" directory in
    the project anyway -- we should either delete it, or figure out
    how to set resources for the unit tests in the project file.
