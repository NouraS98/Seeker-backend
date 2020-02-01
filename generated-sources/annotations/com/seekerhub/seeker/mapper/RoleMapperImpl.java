package com.seekerhub.seeker.mapper;

import com.seekerhub.seeker.dto.role.RoleDto;
import com.seekerhub.seeker.entity.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-02T00:58:20+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 10 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role toEntity(RoleDto dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( dto.getId() );
        role.setRole( dto.getRole() );

        return role;
    }

    @Override
    public RoleDto toDto(Role entity) {
        if ( entity == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        if ( entity.getId() != null ) {
            roleDto.setId( entity.getId() );
        }
        roleDto.setRole( entity.getRole() );

        return roleDto;
    }

    @Override
    public List<Role> toEntities(List<RoleDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( dtos.size() );
        for ( RoleDto roleDto : dtos ) {
            list.add( toEntity( roleDto ) );
        }

        return list;
    }

    @Override
    public List<RoleDto> toDtos(List<Role> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( entities.size() );
        for ( Role role : entities ) {
            list.add( toDto( role ) );
        }

        return list;
    }

    @Override
    public Set<Role> toEntities(Set<RoleDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Role> set = new HashSet<Role>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( RoleDto roleDto : dtos ) {
            set.add( toEntity( roleDto ) );
        }

        return set;
    }

    @Override
    public Set<RoleDto> toDtos(Set<Role> entities) {
        if ( entities == null ) {
            return null;
        }

        Set<RoleDto> set = new HashSet<RoleDto>( Math.max( (int) ( entities.size() / .75f ) + 1, 16 ) );
        for ( Role role : entities ) {
            set.add( toDto( role ) );
        }

        return set;
    }
}
