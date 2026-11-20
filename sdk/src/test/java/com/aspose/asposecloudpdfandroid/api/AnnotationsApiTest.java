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
import com.aspose.asposecloudpdfandroid.model.AnnotationType;
import com.aspose.asposecloudpdfandroid.model.AnnotationsInfoResponse;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.CaretAnnotation;
import com.aspose.asposecloudpdfandroid.model.CaretAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.CaretAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.CircleAnnotation;
import com.aspose.asposecloudpdfandroid.model.CircleAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.CircleAnnotationsResponse;
import java.io.File;
import com.aspose.asposecloudpdfandroid.model.FileAttachmentAnnotation;
import com.aspose.asposecloudpdfandroid.model.FileAttachmentAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.FileAttachmentAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.FreeTextAnnotation;
import com.aspose.asposecloudpdfandroid.model.FreeTextAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.FreeTextAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.HighlightAnnotation;
import com.aspose.asposecloudpdfandroid.model.HighlightAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.HighlightAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.InkAnnotation;
import com.aspose.asposecloudpdfandroid.model.InkAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.InkAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.LineAnnotation;
import com.aspose.asposecloudpdfandroid.model.LineAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.LineAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.MovieAnnotation;
import com.aspose.asposecloudpdfandroid.model.MovieAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.MovieAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.PolyLineAnnotation;
import com.aspose.asposecloudpdfandroid.model.PolyLineAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.PolyLineAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.PolygonAnnotation;
import com.aspose.asposecloudpdfandroid.model.PolygonAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.PolygonAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.PopupAnnotation;
import com.aspose.asposecloudpdfandroid.model.PopupAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.PopupAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.RedactionAnnotation;
import com.aspose.asposecloudpdfandroid.model.RedactionAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.RedactionAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.ScreenAnnotation;
import com.aspose.asposecloudpdfandroid.model.ScreenAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.ScreenAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.SoundAnnotation;
import com.aspose.asposecloudpdfandroid.model.SoundAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.SoundAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.SquareAnnotation;
import com.aspose.asposecloudpdfandroid.model.SquareAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.SquareAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.SquigglyAnnotation;
import com.aspose.asposecloudpdfandroid.model.SquigglyAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.SquigglyAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.StampAnnotation;
import com.aspose.asposecloudpdfandroid.model.StampAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.StampAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.StrikeOutAnnotation;
import com.aspose.asposecloudpdfandroid.model.StrikeOutAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.StrikeOutAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.TextAnnotation;
import com.aspose.asposecloudpdfandroid.model.TextAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.TextAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.UnderlineAnnotation;
import com.aspose.asposecloudpdfandroid.model.UnderlineAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.UnderlineAnnotationsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnotationsApi
 */
@Ignore
public class AnnotationsApiTest {

    private final AnnotationsApi api = new AnnotationsApi();

    
    /**
     * Delete document annotation by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Delete all annotations from the document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deleteDocumentAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Delete all annotations from the page
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.deletePageAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page caret annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCaretAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        CaretAnnotationResponse response = api.getCaretAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page circle annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCircleAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        CircleAnnotationResponse response = api.getCircleAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        AnnotationsInfoResponse response = api.getDocumentAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document caret annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentCaretAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        CaretAnnotationsResponse response = api.getDocumentCaretAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document circle annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentCircleAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        CircleAnnotationsResponse response = api.getDocumentCircleAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document FileAttachment annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentFileAttachmentAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        FileAttachmentAnnotationsResponse response = api.getDocumentFileAttachmentAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document free text annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentFreeTextAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        FreeTextAnnotationsResponse response = api.getDocumentFreeTextAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document highlight annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentHighlightAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        HighlightAnnotationsResponse response = api.getDocumentHighlightAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document ink annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentInkAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        InkAnnotationsResponse response = api.getDocumentInkAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document line annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentLineAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        LineAnnotationsResponse response = api.getDocumentLineAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document movie annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentMovieAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        MovieAnnotationsResponse response = api.getDocumentMovieAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document polyline annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPolyLineAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        PolyLineAnnotationsResponse response = api.getDocumentPolyLineAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document polygon annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPolygonAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        PolygonAnnotationsResponse response = api.getDocumentPolygonAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document popup annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPopupAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        PopupAnnotationsResponse response = api.getDocumentPopupAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document popup annotations by parent id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPopupAnnotationsByParentTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        PopupAnnotationsResponse response = api.getDocumentPopupAnnotationsByParent(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document redaction annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentRedactionAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        RedactionAnnotationsResponse response = api.getDocumentRedactionAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document screen annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentScreenAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        ScreenAnnotationsResponse response = api.getDocumentScreenAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document sound annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentSoundAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        SoundAnnotationsResponse response = api.getDocumentSoundAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document square annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentSquareAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        SquareAnnotationsResponse response = api.getDocumentSquareAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document squiggly annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentSquigglyAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        SquigglyAnnotationsResponse response = api.getDocumentSquigglyAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document stamp annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentStampAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        StampAnnotationsResponse response = api.getDocumentStampAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document StrikeOut annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentStrikeOutAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        StrikeOutAnnotationsResponse response = api.getDocumentStrikeOutAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document text annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTextAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        TextAnnotationsResponse response = api.getDocumentTextAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document underline annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentUnderlineAnnotationsTest() throws ApiException {
        String name = null;
        String storage = null;
        String folder = null;
        UnderlineAnnotationsResponse response = api.getDocumentUnderlineAnnotations(name, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page FileAttachment annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileAttachmentAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        FileAttachmentAnnotationResponse response = api.getFileAttachmentAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page FileAttachment annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileAttachmentAnnotationDataTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        File response = api.getFileAttachmentAnnotationData(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page free text annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFreeTextAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        FreeTextAnnotationResponse response = api.getFreeTextAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page highlight annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHighlightAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        HighlightAnnotationResponse response = api.getHighlightAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page ink annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInkAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        InkAnnotationResponse response = api.getInkAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page line annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLineAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        LineAnnotationResponse response = api.getLineAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page movie annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMovieAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        MovieAnnotationResponse response = api.getMovieAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        AnnotationsInfoResponse response = api.getPageAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page caret annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageCaretAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        CaretAnnotationsResponse response = api.getPageCaretAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page circle annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageCircleAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        CircleAnnotationsResponse response = api.getPageCircleAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page FileAttachment annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageFileAttachmentAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        FileAttachmentAnnotationsResponse response = api.getPageFileAttachmentAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page free text annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageFreeTextAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        FreeTextAnnotationsResponse response = api.getPageFreeTextAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page highlight annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageHighlightAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        HighlightAnnotationsResponse response = api.getPageHighlightAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page ink annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageInkAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        InkAnnotationsResponse response = api.getPageInkAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page line annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageLineAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        LineAnnotationsResponse response = api.getPageLineAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page movie annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageMovieAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        MovieAnnotationsResponse response = api.getPageMovieAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page polyline annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagePolyLineAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        PolyLineAnnotationsResponse response = api.getPagePolyLineAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page polygon annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagePolygonAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        PolygonAnnotationsResponse response = api.getPagePolygonAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page popup annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagePopupAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        PopupAnnotationsResponse response = api.getPagePopupAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page redaction annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageRedactionAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        RedactionAnnotationsResponse response = api.getPageRedactionAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page screen annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageScreenAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        ScreenAnnotationsResponse response = api.getPageScreenAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page sound annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageSoundAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        SoundAnnotationsResponse response = api.getPageSoundAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page square annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageSquareAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        SquareAnnotationsResponse response = api.getPageSquareAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page squiggly annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageSquigglyAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        SquigglyAnnotationsResponse response = api.getPageSquigglyAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page stamp annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageStampAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        StampAnnotationsResponse response = api.getPageStampAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page StrikeOut annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageStrikeOutAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        StrikeOutAnnotationsResponse response = api.getPageStrikeOutAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page text annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTextAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        TextAnnotationsResponse response = api.getPageTextAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page underline annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageUnderlineAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        String storage = null;
        String folder = null;
        UnderlineAnnotationsResponse response = api.getPageUnderlineAnnotations(name, pageNumber, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page polyline annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolyLineAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        PolyLineAnnotationResponse response = api.getPolyLineAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page polygon annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolygonAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        PolygonAnnotationResponse response = api.getPolygonAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page popup annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPopupAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        PopupAnnotationResponse response = api.getPopupAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page redaction annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRedactionAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        RedactionAnnotationResponse response = api.getRedactionAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page screen annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScreenAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        ScreenAnnotationResponse response = api.getScreenAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page screen annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScreenAnnotationDataTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        File response = api.getScreenAnnotationData(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page sound annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSoundAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        SoundAnnotationResponse response = api.getSoundAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page sound annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSoundAnnotationDataTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        File response = api.getSoundAnnotationData(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page square annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSquareAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        SquareAnnotationResponse response = api.getSquareAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page squiggly annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSquigglyAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        SquigglyAnnotationResponse response = api.getSquigglyAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page stamp annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStampAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        StampAnnotationResponse response = api.getStampAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page stamp annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStampAnnotationDataTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        File response = api.getStampAnnotationData(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page StrikeOut annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStrikeOutAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        StrikeOutAnnotationResponse response = api.getStrikeOutAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page text annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTextAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        TextAnnotationResponse response = api.getTextAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Read document page underline annotation by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnderlineAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String storage = null;
        String folder = null;
        UnderlineAnnotationResponse response = api.getUnderlineAnnotation(name, annotationId, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page caret annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageCaretAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<CaretAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageCaretAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page circle annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageCircleAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<CircleAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageCircleAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page FileAttachment annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageFileAttachmentAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<FileAttachmentAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageFileAttachmentAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page free text annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageFreeTextAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<FreeTextAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageFreeTextAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page highlight annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageHighlightAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<HighlightAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageHighlightAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page ink annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageInkAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<InkAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageInkAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page line annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageLineAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<LineAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageLineAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page movie annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageMovieAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<MovieAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageMovieAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page polyline annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagePolyLineAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<PolyLineAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPagePolyLineAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page polygon annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagePolygonAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<PolygonAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPagePolygonAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page redaction annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageRedactionAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<RedactionAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        Boolean apply = null;
        AsposeResponse response = api.postPageRedactionAnnotations(name, pageNumber, annotations, storage, folder, apply);

        // TODO: test validations
    }
    
    /**
     * Add document page screen annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageScreenAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<ScreenAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageScreenAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page sound annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageSoundAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<SoundAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageSoundAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page square annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageSquareAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<SquareAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageSquareAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page squiggly annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageSquigglyAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<SquigglyAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageSquigglyAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page stamp annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageStampAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<StampAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageStampAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page StrikeOut annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageStrikeOutAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<StrikeOutAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageStrikeOutAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page text annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageTextAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<TextAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageTextAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document page underline annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageUnderlineAnnotationsTest() throws ApiException {
        String name = null;
        Integer pageNumber = null;
        List<UnderlineAnnotation> annotations = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPageUnderlineAnnotations(name, pageNumber, annotations, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Add document popup annotations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPopupAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        PopupAnnotation annotation = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.postPopupAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Flattens the annotations of the specified types
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAnnotationsFlattenTest() throws ApiException {
        String name = null;
        Integer startPage = null;
        Integer endPage = null;
        List<AnnotationType> annotationTypes = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putAnnotationsFlatten(name, startPage, endPage, annotationTypes, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document caret annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCaretAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        CaretAnnotation annotation = null;
        String storage = null;
        String folder = null;
        CaretAnnotationResponse response = api.putCaretAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document circle annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCircleAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        CircleAnnotation annotation = null;
        String storage = null;
        String folder = null;
        CircleAnnotationResponse response = api.putCircleAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document FileAttachment annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFileAttachmentAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        FileAttachmentAnnotation annotation = null;
        String storage = null;
        String folder = null;
        FileAttachmentAnnotationResponse response = api.putFileAttachmentAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document FileAttachment annotation content to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFileAttachmentAnnotationDataExtractTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String outFolder = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putFileAttachmentAnnotationDataExtract(name, annotationId, outFolder, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document free text annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFreeTextAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        FreeTextAnnotation annotation = null;
        String storage = null;
        String folder = null;
        FreeTextAnnotationResponse response = api.putFreeTextAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document highlight annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putHighlightAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        HighlightAnnotation annotation = null;
        String storage = null;
        String folder = null;
        HighlightAnnotationResponse response = api.putHighlightAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document ink annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInkAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        InkAnnotation annotation = null;
        String storage = null;
        String folder = null;
        InkAnnotationResponse response = api.putInkAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document line annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLineAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        LineAnnotation annotation = null;
        String storage = null;
        String folder = null;
        LineAnnotationResponse response = api.putLineAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document movie annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putMovieAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        MovieAnnotation annotation = null;
        String storage = null;
        String folder = null;
        MovieAnnotationResponse response = api.putMovieAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document polyline annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPolyLineAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        PolyLineAnnotation annotation = null;
        String storage = null;
        String folder = null;
        PolyLineAnnotationResponse response = api.putPolyLineAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document polygon annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPolygonAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        PolygonAnnotation annotation = null;
        String storage = null;
        String folder = null;
        PolygonAnnotationResponse response = api.putPolygonAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document popup annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPopupAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        PopupAnnotation annotation = null;
        String storage = null;
        String folder = null;
        PopupAnnotationResponse response = api.putPopupAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document redaction annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putRedactionAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        RedactionAnnotation annotation = null;
        String storage = null;
        String folder = null;
        Boolean apply = null;
        RedactionAnnotationResponse response = api.putRedactionAnnotation(name, annotationId, annotation, storage, folder, apply);

        // TODO: test validations
    }
    
    /**
     * Replace document screen annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putScreenAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        ScreenAnnotation annotation = null;
        String storage = null;
        String folder = null;
        ScreenAnnotationResponse response = api.putScreenAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document screen annotation content to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putScreenAnnotationDataExtractTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String outFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putScreenAnnotationDataExtract(name, annotationId, outFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document sound annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSoundAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        SoundAnnotation annotation = null;
        String storage = null;
        String folder = null;
        SoundAnnotationResponse response = api.putSoundAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document sound annotation content to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSoundAnnotationDataExtractTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String outFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putSoundAnnotationDataExtract(name, annotationId, outFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document square annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSquareAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        SquareAnnotation annotation = null;
        String storage = null;
        String folder = null;
        SquareAnnotationResponse response = api.putSquareAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document squiggly annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSquigglyAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        SquigglyAnnotation annotation = null;
        String storage = null;
        String folder = null;
        SquigglyAnnotationResponse response = api.putSquigglyAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document stamp annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStampAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        StampAnnotation annotation = null;
        String storage = null;
        String folder = null;
        StampAnnotationResponse response = api.putStampAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Extract document stamp annotation content to storage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStampAnnotationDataExtractTest() throws ApiException {
        String name = null;
        String annotationId = null;
        String outFilePath = null;
        String storage = null;
        String folder = null;
        AsposeResponse response = api.putStampAnnotationDataExtract(name, annotationId, outFilePath, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document StrikeOut annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStrikeOutAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        StrikeOutAnnotation annotation = null;
        String storage = null;
        String folder = null;
        StrikeOutAnnotationResponse response = api.putStrikeOutAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document text annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTextAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        TextAnnotation annotation = null;
        String storage = null;
        String folder = null;
        TextAnnotationResponse response = api.putTextAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
    /**
     * Replace document underline annotation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUnderlineAnnotationTest() throws ApiException {
        String name = null;
        String annotationId = null;
        UnderlineAnnotation annotation = null;
        String storage = null;
        String folder = null;
        UnderlineAnnotationResponse response = api.putUnderlineAnnotation(name, annotationId, annotation, storage, folder);

        // TODO: test validations
    }
    
}
