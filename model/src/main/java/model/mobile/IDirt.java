package model.mobile;

import model.element.Element;

import java.util.Observable;

public interface IDirt {
    /**
     * Gets the width.
     *
     * @return the width
     */
    int getWidth();

    /**
     * Gets the height.
     *
     * @return the height
     */
    int getHeight();

    /**
     * Gets the on the dirt XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the road XY
     */
    Element getOnTheDirtXY(int x, int y);

    /**
     * Sets the mobile has changed.
     */
    void setMobileHasChanged();

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    Observable getObservable();
}
