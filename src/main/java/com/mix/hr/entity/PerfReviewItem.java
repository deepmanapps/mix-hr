package com.mix.hr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PerfReviewItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String perfReviewItemSeqId;

    private String perfReviewId; // Link to parent review
    private String perfReviewItemTypeId;
    private String perfRatingTypeId; // Rating
    private String comments;
}
