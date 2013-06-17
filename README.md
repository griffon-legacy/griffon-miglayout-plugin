
MigLayout integration
---------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/miglayout](http://artifacts.griffon-framework.org/plugin/miglayout)


Provides integration with [MigLayout][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*    | *Type*                           |
| --------- | -------------------------------- |
| migLayout | `net.miginfocom.swing.MigLayout` |

This node supports the following properties

 * **layoutConstraints** - defines general constraints
 * **columnConstraints** - defines constraints applicable to columns only
 * **rowConstraints** - defines constraints applicable to rows only

The plugin includes a copy of the MigLayout white-paper in PDF format. Refer also to the [MigLayout Cheatsheet][2] 
to know more about what constraints can be used with this layout.

### Example

The `migLayout` node can be used as any other layout node inside a Griffon View, for example

    application(title: 'Sample', pack:true,
        locationByPlatform:true,
        iconImage: imageIcon('/griffon-icon-48x48.png').image,
        iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                   imageIcon('/griffon-icon-32x32.png').image,
                   imageIcon('/griffon-icon-16x16.png').image]) {
        migLayout(layoutConstraints: 'fill')

        label 'Username:', constraints: 'left'
        textField columns: 20, text: bind('username', target: model), constraints: 'wrap'
        label 'Password:', constraints: 'left'
        passwordField columns: 20, text: bind('password', target: model), constraints: 'wrap'
        button loginAction, constraints: 'span 2, right'
    }

[1]: http://www.miglayout.com
[2]: http://migcalendar.com/miglayout/cheatsheet.html

