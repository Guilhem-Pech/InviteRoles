/*
 * MIT License
 *
 * Copyright (c) 2019 Shimmermare
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.shimmermare.inviteroles;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;
import java.util.Arrays;

public final class Utils
{
    private Utils()
    {
    }

    /**
     * Replace all except first 4 symbols in invite code with stars.
     *
     * @param code invite code.
     * @return censored invite code.
     */
    public static String censorInviteCode(String code)
    {
        char[] stars = new char[code.length() - 4];
        Arrays.fill(stars, '*');
        return code.substring(0, 4) + new String(stars);
    }

    public static MessageEmbed createLogEmbed(String log)
    {
        return new EmbedBuilder()
                .setColor(Color.RED)
                .setAuthor("Warning Message!")
                .setThumbnail("url") //TODO set url
                .setDescription(log)
                .setFooter("InviteRole v1.0.0 by Shimmermare")
                .build();
    }
}
