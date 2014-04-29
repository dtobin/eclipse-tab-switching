## Tab Switching Eclipse Plugin

I've long been frustrated with the lack of decent editor tab management in eclipse, so I wrote a small plugin to define commands for the standard Alt-1 through Alt-9 key bindings used by most editors and terminals.

Alt-1 through Alt-8 switch to the editor tabs at those indexes (one-indexed), and Alt-9 switches to the last editor tab.

The default bindings are actually M3+{number}, where M3 is the Option key on MacOS X, and the ALT key on most other platforms.  The more important part is that the commands exist, so you can change them yourself in Editors > Keys (search for the category Tab Switching).

## Installation

I will set up a download site for the plugin eventually, but in the meantime it's pretty simple to build and install the plugin yourself.

You will need Eclipse PDE to be able to build the plugin in eclipse.  Then use the "Export (Deployable plugin-ins and plugins)" command to build a plugin jar.

If you're using eclipse 3.4 or later, you can then add the plugin to your "ECLIPSE_HOME/dropins" directory.  See https://wiki.eclipse.org/Equinox/p2/Getting_Started for more information.

If that doesn't work, I would recommend creating your own update site and feature plugins in eclipse, and creating an update site to install from on your local filesystem.
