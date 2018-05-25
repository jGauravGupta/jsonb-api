/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.json.bind.config;

/**
 * Specifies predefined property order strategies.
 * This strategy can be set via {@link javax.json.bind.JsonbConfig#withPropertyOrderStrategy(String)}
 *
 * @see javax.json.bind.JsonbConfig
 * @since JSON Binding 1.0
 */
public final class PropertyOrderStrategy {

    /**
     * Private constructor to disallow instantiation.
     */
    private PropertyOrderStrategy() { };

    /**
     * Using this strategy, the order of properties is lexicographical.
     */
    public static final String LEXICOGRAPHICAL = "LEXICOGRAPHICAL";

    /**
     * Using this strategy, the order of properties
     * is not guaranteed to retain any order.
     */
    public static final String ANY = "ANY";

    /**
     * Using this strategy, the order of properties is in reverse order
     * to lexicographical order.
     */
    public static final String REVERSE = "REVERSE";
}
