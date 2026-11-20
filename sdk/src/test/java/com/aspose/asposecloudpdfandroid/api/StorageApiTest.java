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
import com.aspose.asposecloudpdfandroid.model.DiscUsage;
import com.aspose.asposecloudpdfandroid.model.FileVersions;
import com.aspose.asposecloudpdfandroid.model.ObjectExist;
import com.aspose.asposecloudpdfandroid.model.StorageExist;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageApi
 */
@Ignore
public class StorageApiTest {

    private final StorageApi api = new StorageApi();

    
    /**
     * Get disc usage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiscUsageTest() throws ApiException {
        String storageName = null;
        DiscUsage response = api.getDiscUsage(storageName);

        // TODO: test validations
    }
    
    /**
     * Get file versions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileVersionsTest() throws ApiException {
        String path = null;
        String storageName = null;
        FileVersions response = api.getFileVersions(path, storageName);

        // TODO: test validations
    }
    
    /**
     * Check if file or folder exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void objectExistsTest() throws ApiException {
        String path = null;
        String storageName = null;
        String versionId = null;
        ObjectExist response = api.objectExists(path, storageName, versionId);

        // TODO: test validations
    }
    
    /**
     * Check if storage exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void storageExistsTest() throws ApiException {
        String storageName = null;
        StorageExist response = api.storageExists(storageName);

        // TODO: test validations
    }
    
}
