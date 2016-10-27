package com.beloo.widget.spanlayoutmanager.layouter;

import android.view.View;

public interface ILayouter {
    /** add views from current row to layout*/
    void layoutRow();
    /** calculate view positions, view won't be actually added to layout when calling this method
     * @return true if view successfully placed, false if view can't be placed because out of space on screen and have to be recycled */
    boolean placeView(View view);
    /** Read layouter state from current attached view. We need only last of it, but we can't determine here which is last.
     * Based on characteristics of last attached view, layouter algorithm will be able to continue placing from it.
     * This method have to be called on attaching view
     * @return * @return true if view successfully attached, false if view can't be attached because out of space on screen */
    boolean onAttachView(View view);

    /** @return size of current row*/
    int getRowSize();

    /** @return top of current row*/
    int getRowTop();

    /** @return bottom of current row */
    int getRowBottom();

    /** @return size of previous row*/
    int getPreviousRowSize();

    /** @param layouterListener listener to layouter events*/
    void setLayouterListener(ILayouterListener layouterListener);

    AbstractPositionIterator positionIterator();
}
