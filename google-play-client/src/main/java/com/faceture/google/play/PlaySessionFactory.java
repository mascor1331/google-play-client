/*
 * Copyright (c) 2012. Faceture Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.faceture.google.play;

/**
 * Creates PlaySessions
 */
public class PlaySessionFactory {

    public PlaySession create(String xtCookie, String sjsaidCookie, String authToken) {
        if (null == xtCookie || xtCookie.isEmpty()) {
            throw new IllegalArgumentException("xtCookie is null or empty");
        }
        if (null == sjsaidCookie || sjsaidCookie.isEmpty()) {
            throw new IllegalArgumentException("sjsaidCookie is null or empty");
        }
        if (null == authToken || authToken.isEmpty()) {
            throw new IllegalArgumentException("authToken is null or empty");
        }

        return new PlaySession(xtCookie, sjsaidCookie, authToken);
    }
}
