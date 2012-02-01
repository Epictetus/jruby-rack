/*
 * Copyright (c) 2010-2012 Engine Yard, Inc.
 * Copyright (c) 2007-2009 Sun Microsystems, Inc.
 * This source code is available under the MIT license.
 * See the file LICENSE.txt for details.
 */

package org.jruby.rack;

import java.util.Map;

/**
 *
 * @author nicksieger
 */
public interface RackResponse {
    /** Return the response status. */
    int getStatus();
    /** Return the response headers. */
    Map getHeaders();
    /** Return the response body */
    String getBody();

    /** Write the status, headers, and body to the response. */
    void respond(RackResponseEnvironment response);
}
