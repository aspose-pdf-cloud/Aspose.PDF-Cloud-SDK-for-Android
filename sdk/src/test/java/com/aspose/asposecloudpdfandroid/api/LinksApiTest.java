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
import com.aspose.asposecloudpdfandroid.model.LinkAnnotation;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotationsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinksApi
 */
@Ignore
public class LinksApiTest {

    private final LinksApi api = new LinksApi();

    
    /**
     * Delete all link annotations from the document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentLinkAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteDocumentLinkAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Delete document page link annotation by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLinkAnnotationTest() throws ApiException {
        String name = null;
        String linkId = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteLinkAnnotation(name, linkId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Delete all link annotations from the page
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageLinkAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deletePageLinkAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document link annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLinkAnnotationTest() throws ApiException {
        String name = null;
        String linkId = null;
        String storage = null;
        String folder = null;
        LinkAnnotationResponse response = api.getLinkAnnotation(name, linkId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page link annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageLinkAnnotationTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String linkId = null;
        String storage = null;
        String folder = null;
        LinkAnnotationResponse response = api.getPageLinkAnnotation(name, pageNumber, linkId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page link annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageLinkAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        LinkAnnotationsResponse response = api.getPageLinkAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page link annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageLinkAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<LinkAnnotation> links = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageLinkAnnotations(name, pageNumber, links, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document page link annotations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLinkAnnotationTest() throws ApiException {
        String name = null;
        String linkId = null;
        LinkAnnotation link = null;
        String storage = null;
        String folder = null;
        LinkAnnotationResponse response = api.putLinkAnnotation(name, linkId, link, storage, folder);

        // TODO: test validations
    }
    
}
