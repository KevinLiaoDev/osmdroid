/**
 The MIT License

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.

 This code was sourced from the National Geospatial Intelligency Agency and was
 originally licensed under the MIT license. It has been modified to support
 osmdroid's APIs.

 You can find the original code base here:
 https://github.com/ngageoint/geopackage-android-map
 https://github.com/ngageoint/geopackage-android
 */

package org.osmdroid.gpkg.overlay.features;

import org.osmdroid.api.IGeoPoint;
import org.osmdroid.util.GeoPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 8/19/2017.
 *
 * @author Alex O'Ree
 */

public class PolygonOptions {

    private int fillColor;
    private String title;
    private int strokeColor;


    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    private float strokeWidth;



    public int getFillColor() {
        return fillColor;
    }

    public String getTitle() {
        return title;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public float getStrokeWidth() {
        return strokeWidth;
    }
}