/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.fernice.reflare.internal;

import java.awt.Image;
import java.awt.image.ImageFilter;
import java.io.IOException;

public class ImageHelper extends Helper {

    private static final ImageAccessor accessor = accessor(ImageAccessor.class);

    public static Image getMultiResolutionImageResource(String resource) throws IOException {
        return accessor.getMultiResolutionImageResource(resource);
    }

    public static Image getScaledInstance(Image image, int width, int height, int hints) {
        return accessor.getScaledInstance(image, width, height, hints);
    }

    public static Image getFilteredInstance(Image image, ImageFilter filter) {
        return accessor.getFilteredInstance(image, filter);
    }

    public interface ImageAccessor {

        Image getMultiResolutionImageResource(String resource) throws IOException;

        Image getScaledInstance(Image image, int width, int height, int hints);

        Image getFilteredInstance(Image image, ImageFilter filter);
    }
}
