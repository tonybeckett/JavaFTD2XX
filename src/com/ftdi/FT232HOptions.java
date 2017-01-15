/*
 * The MIT License
 *
 * Copyright 2017 TBeckett
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ftdi;

/**
 * FT232HOptions
 *
 * @author TBeckett
 */
public enum FT232HOptions
{
    FT232H_OPTION_TRISTATE(0x00),
    FT232H_OPTION_TXLED(0x01),
    FT232H_OPTION_RXLED(0x02),
    FT232H_OPTION_TXRXLED(0x03),
    FT232H_OPTION_PWREN(0x04),
    FT232H_OPTION_SLEEP(0x05),
    FT232H_OPTION_DRIVE_0(0x06),
    FT232H_OPTION_DRIVE_1(0x07),
    FT232H_OPTION_IOMODE(0x08),
    FT232H_OPTION_TXDEN(0x09),
    FT232H_OPTION_CLK30(0x0A),
    FT232H_OPTION_CLK15(0x0B),
    FT232H_OPTION_CLK7_5(0x0C);

    private final int constant;

    private FT232HOptions(int constant)
    {
        this.constant = constant;
    }

    int constant()
    {
        return this.constant;
    }

    static FT232HOptions parse(int val)
    {
        for (FT232HOptions curr : FT232HOptions.values())
        {
            if (curr.constant() == val)
            {
                return curr;
            }
        }
        return null;
    }
}
