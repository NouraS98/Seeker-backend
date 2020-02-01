package com.seekerhub.seeker.mapper;

import com.seekerhub.seeker.dto.Employer.EmployerDto;
import com.seekerhub.seeker.entity.Employer;
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
public class EmployerMapperImpl implements EmployerMapper {

    @Override
    public Employer toEntity(EmployerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employer employer = new Employer();

        employer.setId( dto.getId() );
        employer.setNum_of_ratings( dto.getNum_of_ratings() );
        employer.setResponse_time( dto.getResponse_time() );
        employer.setNum_of_posted_Projects( dto.getNum_of_posted_Projects() );
        employer.setTotal_on_time_payment( dto.getTotal_on_time_payment() );

        return employer;
    }

    @Override
    public EmployerDto toDto(Employer entity) {
        if ( entity == null ) {
            return null;
        }

        EmployerDto employerDto = new EmployerDto();

        if ( entity.getId() != null ) {
            employerDto.setId( entity.getId() );
        }
        employerDto.setNum_of_ratings( entity.getNum_of_ratings() );
        employerDto.setResponse_time( entity.getResponse_time() );
        employerDto.setNum_of_posted_Projects( entity.getNum_of_posted_Projects() );
        employerDto.setTotal_on_time_payment( entity.getTotal_on_time_payment() );

        return employerDto;
    }

    @Override
    public List<Employer> toEntities(List<EmployerDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Employer> list = new ArrayList<Employer>( dtos.size() );
        for ( EmployerDto employerDto : dtos ) {
            list.add( toEntity( employerDto ) );
        }

        return list;
    }

    @Override
    public List<EmployerDto> toDtos(List<Employer> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EmployerDto> list = new ArrayList<EmployerDto>( entities.size() );
        for ( Employer employer : entities ) {
            list.add( toDto( employer ) );
        }

        return list;
    }

    @Override
    public Set<Employer> toEntities(Set<EmployerDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Employer> set = new HashSet<Employer>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( EmployerDto employerDto : dtos ) {
            set.add( toEntity( employerDto ) );
        }

        return set;
    }

    @Override
    public Set<EmployerDto> toDtos(Set<Employer> entities) {
        if ( entities == null ) {
            return null;
        }

        Set<EmployerDto> set = new HashSet<EmployerDto>( Math.max( (int) ( entities.size() / .75f ) + 1, 16 ) );
        for ( Employer employer : entities ) {
            set.add( toDto( employer ) );
        }

        return set;
    }
}
