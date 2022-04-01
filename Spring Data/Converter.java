// ModelMapper Json / Xml to POJO Type Converter (Example: String -> LocalDate)

Converter<String, LocalDate> converter = new Converter<String, LocalDate>() {
            @Override
            public LocalDate convert(MappingContext<String, LocalDate> mappingContext) {
                return LocalDate.parse(mappingContext.getSource(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
        };

        this.modelMapper.addConverter(converter);

//------------------------------
