package com.example.website_ban_ao_the_thao_psg.model.response;

import com.example.website_ban_ao_the_thao_psg.common.ApplicationConstant.TrangThaiTaiKhoan;
import com.example.website_ban_ao_the_thao_psg.entity.ThuHang;
import com.example.website_ban_ao_the_thao_psg.entity.VaiTro;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class TaiKhoanResponse {
    private Integer id;
    private ThuHang thuHang;
    private VaiTro vaiTro;
    private String ten;
    private Boolean gioiTinh;
    private LocalDate ngaySinh;
    private String diaChi;
    private String sdt;
    private String email;
    private Integer soLuongDonHangThanhCong;
    private String matKhau;
    private BigDecimal soTienDaChiTieu;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    @Enumerated(EnumType.STRING)
    private TrangThaiTaiKhoan trangThai;
}
