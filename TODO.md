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

