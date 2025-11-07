package com.board.board_project.service;

import com.board.board_project.dto.post.response.PostDetailRes;
import com.board.board_project.dto.post.response.PostListRes;

import java.util.List;

public interface PostService {
    void createPost(Long memberId, String title, String content, List<String> imageUuids);
    void saveImageInfo(String uuid, String fileName, String filePath, long fileSize, String contentType);
    PostListRes getPostList(int page);

    PostDetailRes getPostDetail(Long postId);
}
