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
import com.aspose.asposecloudpdfandroid.model.DocumentPageResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentPagesResponse;
import java.io.File;
import com.aspose.asposecloudpdfandroid.model.Signature;
import com.aspose.asposecloudpdfandroid.model.Stamp;
import com.aspose.asposecloudpdfandroid.model.WordCountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagesApi
 */
@Ignore
public class PagesApiTest {

    private final PagesApi api = new PagesApi();

    
    /**
     * Delete document page by its number.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deletePage(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        DocumentPageResponse response = api.getPage(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Bmp image and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToBmpTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPageConvertToBmp(name, pageNumber, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Emf image and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToEmfTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPageConvertToEmf(name, pageNumber, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Gif image and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToGifTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPageConvertToGif(name, pageNumber, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Jpeg image and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToJpegTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPageConvertToJpeg(name, pageNumber, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Png image and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToPngTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPageConvertToPng(name, pageNumber, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Tiff image  and return resulting file in response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToTiffTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        File response = api.getPageConvertToTiff(name, pageNumber, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Read document pages info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        DocumentPagesResponse response = api.getPages(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Get number of words per document page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWordsPerPageTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        WordCountResponse response = api.getWordsPerPage(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Move page to new position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMovePageTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer newIndex = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postMovePage(name, pageNumber, newIndex, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Certify document page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageCertifyTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Signature sign = null;
        String docMdpAccessPermissionType = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageCertify(name, pageNumber, sign, docMdpAccessPermissionType, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Sign page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSignPageTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Signature sign = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postSignPage(name, pageNumber, sign, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add new page to end of the document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAddNewPageTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        DocumentPagesResponse response = api.putAddNewPage(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add page stamp.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageAddStampTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Stamp stamp = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putPageAddStamp(name, pageNumber, stamp, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Convert document page to bmp image and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToBmpTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPageConvertToBmp(name, pageNumber, outPath, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to emf image and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToEmfTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPageConvertToEmf(name, pageNumber, outPath, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to gif image and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToGifTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPageConvertToGif(name, pageNumber, outPath, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Jpeg image and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToJpegTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPageConvertToJpeg(name, pageNumber, outPath, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to png image and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToPngTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPageConvertToPng(name, pageNumber, outPath, width, height, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Convert document page to Tiff image and upload resulting file to storage.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToTiffTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String outPath = null;
        Integer width = null;
        Integer height = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.putPageConvertToTiff(name, pageNumber, outPath, width, height, folder, storage, password);

        // TODO: test validations
    }
    
}
