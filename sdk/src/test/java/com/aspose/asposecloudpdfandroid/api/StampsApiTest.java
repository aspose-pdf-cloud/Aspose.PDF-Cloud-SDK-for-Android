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
import com.aspose.asposecloudpdfandroid.model.ImageStamp;
import com.aspose.asposecloudpdfandroid.model.ImageStampPageSpecified;
import com.aspose.asposecloudpdfandroid.model.PageNumberStamp;
import com.aspose.asposecloudpdfandroid.model.PdfPageStamp;
import com.aspose.asposecloudpdfandroid.model.StampsInfoResponse;
import com.aspose.asposecloudpdfandroid.model.TextStamp;
import com.aspose.asposecloudpdfandroid.model.TextStampPageSpecified;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StampsApi
 */
@Ignore
public class StampsApiTest {

    private final StampsApi api = new StampsApi();

    
    /**
     * Delete all stamps from the document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentStampsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.deleteDocumentStamps(name, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Delete all stamps from the page
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageStampsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.deletePageStamps(name, pageNumber, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Delete document stamp by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStampTest() throws ApiException {
        String name = null;
        String stampId = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.deleteStamp(name, stampId, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Read document stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentStampsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        StampsInfoResponse response = api.getDocumentStamps(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read page document stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageStampsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        String password = null;
        StampsInfoResponse response = api.getPageStamps(name, pageNumber, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document pages image stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentImageStampsTest() throws ApiException {
        String name = null;
        List<ImageStamp> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentImageStamps(name, stamps, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document image stamps to specified pages.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentImageStampsPageSpecifiedTest() throws ApiException {
        String name = null;
        List<ImageStampPageSpecified> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentImageStampsPageSpecified(name, stamps, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document page number stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentPageNumberStampsTest() throws ApiException {
        String name = null;
        PageNumberStamp stamp = null;
        Integer startPageNumber = null;
        Integer endPageNumber = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentPageNumberStamps(name, stamp, startPageNumber, endPageNumber, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document pages text stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentTextStampsTest() throws ApiException {
        String name = null;
        List<TextStamp> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentTextStamps(name, stamps, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document text stamps to specified pages.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentTextStampsPageSpecifiedTest() throws ApiException {
        String name = null;
        List<TextStampPageSpecified> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postDocumentTextStampsPageSpecified(name, stamps, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document page image stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageImageStampsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<ImageStamp> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postPageImageStamps(name, pageNumber, stamps, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document pdf page stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagePdfPageStampsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<PdfPageStamp> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postPagePdfPageStamps(name, pageNumber, stamps, storage, folder, password);

        // TODO: test validations
    }
    
    /**
     * Add document page text stamps.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageTextStampsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<TextStamp> stamps = null;
        String storage = null;
        String folder = null;
        String password = null;
        AsposeResponse response = api.postPageTextStamps(name, pageNumber, stamps, storage, folder, password);

        // TODO: test validations
    }
    
}
