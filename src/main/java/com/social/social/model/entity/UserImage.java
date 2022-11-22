package com.social.social.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_images")
@DynamicInsert
@DynamicUpdate
public class UserImage {

    @Id
    @SequenceGenerator(name = "seq_user_image_id_gen", sequenceName = "seq_user_image_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user_image_id_gen")
    private Long id;

    private String mediaType;
    @Column(nullable = false)
    private Long size;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true, unique = true)
    private String path;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    // Audit
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private Boolean enable;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserImage userImage = (UserImage) o;
        return id != null && Objects.equals(id, userImage.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
