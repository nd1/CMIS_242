// CMIS 242 
// Duane J. Jarc
// June 16, 2015
// Week 5 Examples

// This interface defines a custom listener for a color selection.
// The processColorChange method is called when a new color is selected.

package customlistener;

import java.awt.*;

interface ColorListener
{
	void processColorChange(Color color);
}	