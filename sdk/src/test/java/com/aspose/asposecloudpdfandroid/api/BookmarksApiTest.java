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
import com.aspose.asposecloudpdfandroid.model.Bookmark;
import com.aspose.asposecloudpdfandroid.model.BookmarkResponse;
import com.aspose.asposecloudpdfandroid.model.BookmarksResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarksApi
 */
@Ignore
public class BookmarksApiTest {

    private final BookmarksApi api = new BookmarksApi();

    
    /**
     * Delete document bookmark by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBookmarkTest() throws ApiException {
        String name = null;
        String bookmarkPath = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.deleteBookmark(name, bookmarkPath, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Delete all document bookmarks.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentBookmarksTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        String password = null;
        AsposeResponse response = api.deleteDocumentBookmarks(name, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Read document bookmark.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarkTest() throws ApiException {
        String name = null;
        String bookmarkPath = null;
        String folder = null;
        String storage = null;
        String password = null;
        BookmarkResponse response = api.getBookmark(name, bookmarkPath, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Read document bookmarks node list.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarksTest() throws ApiException {
        String name = null;
        String bookmarkPath = null;
        String folder = null;
        String storage = null;
        String password = null;
        BookmarksResponse response = api.getBookmarks(name, bookmarkPath, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Read document bookmarks tree.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentBookmarksTest() throws ApiException {
        String name = null;
        String folder = null;
        String storage = null;
        String password = null;
        BookmarksResponse response = api.getDocumentBookmarks(name, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Add document bookmarks.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postBookmarkTest() throws ApiException {
        String name = null;
        String bookmarkPath = null;
        List<Bookmark> bookmarks = null;
        String folder = null;
        String storage = null;
        String password = null;
        BookmarksResponse response = api.postBookmark(name, bookmarkPath, bookmarks, folder, storage, password);

        // TODO: test validations
    }
    
    /**
     * Update document bookmark.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putBookmarkTest() throws ApiException {
        String name = null;
        String bookmarkPath = null;
        Bookmark bookmark = null;
        String folder = null;
        String storage = null;
        String password = null;
        BookmarkResponse response = api.putBookmark(name, bookmarkPath, bookmark, folder, storage, password);

        // TODO: test validations
    }
    
}
