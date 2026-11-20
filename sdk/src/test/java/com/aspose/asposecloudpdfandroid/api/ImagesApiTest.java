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
import java.io.File;
import com.aspose.asposecloudpdfandroid.model.ImageResponse;
import com.aspose.asposecloudpdfandroid.model.ImagesResponse;
import com.aspose.asposecloudpdfandroid.model.SvgImages;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImagesApi
 */
@Ignore
public class ImagesApiTest {

    private final ImagesApi api = new ImagesApi();

    
    /**
     * Delete image from document page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteImageTest() throws ApiException {
        String name = null;
        String imageId = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteImage(name, imageId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document image by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImageTest() throws ApiException {
        String name = null;
        String imageId = null;
        String storage = null;
        String folder = null;
        ImageResponse response = api.getImage(name, imageId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in GIF format
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImageExtractAsGifTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        File response = api.getImageExtractAsGif(name, imageId, width, height, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in JPEG format
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImageExtractAsJpegTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        File response = api.getImageExtractAsJpeg(name, imageId, width, height, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in PNG format
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImageExtractAsPngTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        File response = api.getImageExtractAsPng(name, imageId, width, height, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in TIFF format
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImageExtractAsTiffTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        File response = api.getImageExtractAsTiff(name, imageId, width, height, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document images.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        ImagesResponse response = api.getImages(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract SVG images from document page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesExtractSvgTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        String passBase64 = null;
        SvgImages response = api.getImagesExtractSvg(name, pageNumber, storage, folder, passBase64);

        // TODO: test validations
    }
    
    /**
     * Insert image to document page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInsertImageTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Double llx = null;
        Double lly = null;
        Double urx = null;
        Double ury = null;
        String imageFilePath = null;
        String storage = null;
        String folder = null;
        File image = null;
        AsposeResponse response = api.postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFilePath, storage, folder, image);

        // TODO: test validations
    }
    
    /**
     * Extract document image in GIF format to folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageExtractAsGifTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImageExtractAsGif(name, imageId, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in JPEG format to folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageExtractAsJpegTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImageExtractAsJpeg(name, imageId, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in PNG format to folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageExtractAsPngTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImageExtractAsPng(name, imageId, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document image in TIFF format to folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageExtractAsTiffTest() throws ApiException {
        String name = null;
        String imageId = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImageExtractAsTiff(name, imageId, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document images in GIF format to folder.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImagesExtractAsGifTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImagesExtractAsGif(name, pageNumber, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document images in JPEG format to folder.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImagesExtractAsJpegTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImagesExtractAsJpeg(name, pageNumber, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document images in PNG format to folder.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImagesExtractAsPngTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImagesExtractAsPng(name, pageNumber, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Extract document images in TIFF format to folder.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImagesExtractAsTiffTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        Integer width = null;
        Integer height = null;
        String storage = null;
        String folder = null;
        String destFolder = null;
        AsposeResponse response = api.putImagesExtractAsTiff(name, pageNumber, width, height, storage, folder, destFolder);

        // TODO: test validations
    }
    
    /**
     * Replace document image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putReplaceImageTest() throws ApiException {
        String name = null;
        String imageId = null;
        String imageFilePath = null;
        String storage = null;
        String folder = null;
        File image = null;
        ImageResponse response = api.putReplaceImage(name, imageId, imageFilePath, storage, folder, image);

        // TODO: test validations
    }
    
    /**
     * Replace document multiple image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putReplaceMultipleImageTest() throws ApiException {
        String name = null;
        List<String> imageIds = null;
        String imageFilePath = null;
        String storage = null;
        String folder = null;
        File image = null;
        ImagesResponse response = api.putReplaceMultipleImage(name, imageIds, imageFilePath, storage, folder, image);

        // TODO: test validations
    }
    
}
