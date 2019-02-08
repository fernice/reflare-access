/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.fernice.reflare.internal;

import java.awt.Image;
import java.io.IOException;

public class ImageHelper extends Helper {

    private static final ImageAccessor accessor = accessor(ImageAccessor.class);

    public static Image getMultiResolutionImageResource(String resource) throws IOException {
        return accessor.getMultiResolutionImageResource(resource);
    }

    public interface ImageAccessor {

        Image getMultiResolutionImageResource(String resource) throws IOException;
    }
}
