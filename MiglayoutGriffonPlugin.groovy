/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class MiglayoutGriffonPlugin {
    // the plugin version
    String version = '0.4'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-miglayout-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'MigLayout integration'
    String description = '''
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
'''
}
