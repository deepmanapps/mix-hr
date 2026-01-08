package com.mix.hr.dto;

public record PerfReviewItemDto(
        String perfReviewItemSeqId,
        String perfReviewId,
        String perfReviewItemTypeId,
        String perfRatingTypeId,
        String comments) {
}
