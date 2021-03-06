/**
 * Copyright (C) 2011 ArtiVisi Intermedia <info@artivisi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.artivisi.belajar.restful.service;

import com.artivisi.belajar.restful.domain.master.Produk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BelajarRestfulServiceMaster extends MonitoredService {

        // Produk
        void save(Produk p);
        void delete(Produk p);
        Produk findProdukByKd(String kd);
        Produk findProdukByName(String name);
        Page<Produk> findAllProduk(Pageable pageable);
        Long countAllProduk();

    

        // konfigurasi aplikasi
/*	void save(ApplicationConfig ac);
	void delete(ApplicationConfig ac);
	ApplicationConfig findApplicationConfigById(String id);
        Page<ApplicationConfig> findAllApplicationConfigs(Pageable pageable);
	Long countAllApplicationConfigs();
	Long countApplicationConfigs(String search);
	Page<ApplicationConfig> findApplicationConfigs(String search, Pageable pageable);

        // menu
        void save(Menu m);
        void delete(Menu m);
        Menu findMenuById(String id);
        List<Menu> findTopLevelMenu();
        Page<Menu> findAllMenu(Pageable pageable);
        Long countAllMenu();
        List<Menu> findMenuByParent(Menu m);
        List<Menu> findMenuNotInRole(Role r);

        // permission
        void save(Permission m);
        void delete(Permission m);
        Permission findPermissionById(String id);
        Page<Permission> findAllPermissions(Pageable pageable);
        Long countAllPermissions();
        List<Permission> findPermissionsNotInRole(Role r);

        // role
        void save(Role role);
        void delete(Role role);
        Role findRoleById(String id);
        Page<Role> findAllRoles(Pageable pageable);
        Long countAllRoles();
*/

}
