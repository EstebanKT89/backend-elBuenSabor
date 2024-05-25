package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class FacturaVenta extends GenericEntity{

    private LocalDateTime fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private LocalDateTime formaPago;
    private Double totalVenta;
}
