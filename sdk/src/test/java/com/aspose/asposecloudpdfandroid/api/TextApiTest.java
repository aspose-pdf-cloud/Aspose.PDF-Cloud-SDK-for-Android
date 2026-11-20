/**
 *
 * Copyright (c) 2026 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdfandroid.api;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.Paragraph;
import com.aspose.asposecloudpdfandroid.model.TextRectsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TextApi
 */
@Ignore
public class TextApiTest {

    private final TextApi api = new TextApi();

    
    /**
     * Read page text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTextTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Double LLX = null;
        Double LLY = null;
        Double URX = null;
        Double URY = null;
        List<String> format = null;
        String regex = null;
        Boolean splitRects = null;
        String folder = null;
        String storage = null;
        TextRectsResponse response = api.getPageText(name, pageNumber, LLX, LLY, URX, URY, format, regex, splitRects, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Read document text.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTextTest() throws ApiException {
        String name = null;
        Double LLX = null;
        Double LLY = null;
        Double URX = null;
        Double URY = null;
        List<String> format = null;
        String regex = null;
        Boolean splitRects = null;
        String folder = null;
        String storage = null;
        TextRectsResponse response = api.getText(name, LLX, LLY, URX, URY, format, regex, splitRects, folder, storage);

        // TODO: test validations
    }
    
    /**
     * Add text to PDF document page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAddTextTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Paragraph paragraph = null;
        String folder = null;
        String storage = null;
        AsposeResponse response = api.putAddText(name, pageNumber, paragraph, folder, storage);

        // TODO: test validations
    }
    
}
