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
import com.aspose.asposecloudpdfandroid.model.TextReplaceListRequest;
import com.aspose.asposecloudpdfandroid.model.TextReplaceResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TextReplaceApi
 */
@Ignore
public class TextReplaceApiTest {

    private final TextReplaceApi api = new TextReplaceApi();

    
    /**
     * Document&#39;s replace text method.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentTextReplaceTest() throws ApiException {
        String name = null;
        TextReplaceListRequest textReplace = null;
        String storage = null;
        String folder = null;
        TextReplaceResponse response = api.postDocumentTextReplace(name, textReplace, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Page&#39;s replace text method.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageTextReplaceTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        TextReplaceListRequest textReplaceListRequest = null;
        String storage = null;
        String folder = null;
        TextReplaceResponse response = api.postPageTextReplace(name, pageNumber, textReplaceListRequest, storage, folder);

        // TODO: test validations
    }
    
}
