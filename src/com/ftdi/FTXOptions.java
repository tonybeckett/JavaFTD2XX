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
 * FTXOptions
 *
 * @author TBeckett
 */
public enum FTXOptions
{
    FTX_OPTION_TRISTATE(0x00),
    FTX_OPTION_TXLED(0x01),
    FTX_OPTION_RXLED(0x02),
    FTX_OPTION_TXRXLED(0x03),
    FTX_OPTION_PWREN(0x04),
    FTX_OPTION_SLEEP(0x05),
    FTX_OPTION_DRIVE_0(0x06),
    FTX_OPTION_DRIVE_1(0x07),
    FTX_OPTION_IOMODE(0x08),
    FTX_OPTION_TXDEN(0x09),
    FTX_OPTION_CLK24(0x0A),
    FTX_OPTION_CLK12(0x0B),
    FTX_OPTION_CLK6(0x0C),
    FTX_OPTION_BCD_CH(0x0D),
    FTX_OPTION_BCD_CH_N(0x0E),
    FTX_OPTION_I2C_TXE(0x0F),
    FTX_OPTION_I2C_RXF(0x10),
    FTX_OPTION_VBUS_SENSE(0x11),
    FTX_OPTION_BB_WR(0x12),
    FTX_OPTION_BB_RD(0x13),
    FTX_OPTION_TIMESTAMP(0x14),
    FTX_OPTION_KEEPAWAKE(0x15);

    private final int constant;

    private FTXOptions(int constant)
    {
        this.constant = constant;
    }

    int constant()
    {
        return this.constant;
    }

    static FTXOptions parse(int val)
    {
        for (FTXOptions curr : FTXOptions.values())
        {
            if (curr.constant() == val)
            {
                return curr;
            }
        }
        return null;
    }
}
