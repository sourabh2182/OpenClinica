
//Generated Aug 3, 2015 9:49:28 AM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FormLayoutMedia generated by hbm2java
 */
@Entity
@Table(name = "form_layout_media", schema = "public")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = {
        @Parameter(name = "sequence_name", value = "form_layout_media_form_layout_media_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FormLayoutMedia extends DataMapDomainObject {

    private int formLayoutMediaId;
    private FormLayout formLayout;
    private int eventCrfId;
    private String name;
    private String path;

    public FormLayoutMedia() {
    }

    public FormLayoutMedia(int formLayoutMediaId, FormLayout formLayout, String name, String path, int eventCrfId) {
        this.formLayoutMediaId = formLayoutMediaId;
        this.formLayout = formLayout;
        this.eventCrfId = eventCrfId;
        this.name = name;
        this.path = path;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "path", nullable = false, length = 4000)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Id
    @Column(name = "form_layout_media_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id-generator")
    public int getFormLayoutMediaId() {
        return formLayoutMediaId;
    }

    public void setFormLayoutMediaId(int formLayoutMediaId) {
        this.formLayoutMediaId = formLayoutMediaId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_layout_id", nullable = false)
    public FormLayout getFormLayout() {
        return formLayout;
    }

    public void setFormLayout(FormLayout formLayout) {
        this.formLayout = formLayout;
    }

    @Column(name = "event_crf_id", nullable = false, length = 4000)
    public int getEventCrfId() {
        return eventCrfId;
    }

    public void setEventCrfId(int eventCrfId) {
        this.eventCrfId = eventCrfId;
    }

}